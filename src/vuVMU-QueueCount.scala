package hwacha

import Chisel._
import Node._
import scala.math.{log, ceil}

class vuVMU_QueueCountIO(w: Int) extends Bundle
{
  val enq = Bool(INPUT);
  val deq = Bool(INPUT);
  val ready = Bool(OUTPUT);
  val qcnt = UFix(w, INPUT);
}

class vuVMU_QueueCount(reset_cnt : Int, ready_cnt : Int, max_cnt : Int, use_qcnt: Boolean = false) extends Component
{
  def ceilLog2(x : Int)=ceil(log(x)/log(2.0)).toInt;

  val io = new vuVMU_QueueCountIO(ceilLog2(max_cnt)+1);
  val count = Reg(resetVal = UFix(reset_cnt, ceilLog2(max_cnt)+1));
  val next_count = Wire(){ UFix(width = ceilLog2(max_cnt)+1) }

  next_count <== count;
  when(io.enq ^ io.deq)
  {
    when(io.enq) {next_count <== count + UFix(1);}
    when(!io.enq) {next_count <== count - UFix(1);}
  }

  count := next_count

  // we need to look at what's in the queue on the next cycle
  if (!use_qcnt)
    io.ready := next_count >= UFix(ready_cnt)
  else
    io.ready := next_count >= io.qcnt
}
