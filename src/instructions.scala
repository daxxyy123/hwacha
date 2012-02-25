package hwacha

import Chisel._
import Node._

object Instructions
{
 // automatically generated by parse-opcodes
  val J          = Bits("b?????????????????????????_1100111",32)
  val JAL        = Bits("b?????????????????????????_1101111",32)
  val JALR_C     = Bits("b?????_?????_????????????_000_1101011",32)
  val JALR_R     = Bits("b?????_?????_????????????_001_1101011",32)
  val JALR_J     = Bits("b?????_?????_????????????_010_1101011",32)
  val RDNPC      = Bits("b?????_00000_000000000000_100_1101011",32)
  val BEQ        = Bits("b?????_?????_?????_???????_000_1100011",32)
  val BNE        = Bits("b?????_?????_?????_???????_001_1100011",32)
  val BLT        = Bits("b?????_?????_?????_???????_100_1100011",32)
  val BGE        = Bits("b?????_?????_?????_???????_101_1100011",32)
  val BLTU       = Bits("b?????_?????_?????_???????_110_1100011",32)
  val BGEU       = Bits("b?????_?????_?????_???????_111_1100011",32)
  val LUI        = Bits("b?????_????????????????????_0110111",32)
  val ADDI       = Bits("b?????_?????_????????????_000_0010011",32)
  val SLLI       = Bits("b?????_?????_000000_??????_001_0010011",32)
  val SLTI       = Bits("b?????_?????_????????????_010_0010011",32)
  val SLTIU      = Bits("b?????_?????_????????????_011_0010011",32)
  val XORI       = Bits("b?????_?????_????????????_100_0010011",32)
  val SRLI       = Bits("b?????_?????_000000_??????_101_0010011",32)
  val SRAI       = Bits("b?????_?????_000001_??????_101_0010011",32)
  val ORI        = Bits("b?????_?????_????????????_110_0010011",32)
  val ANDI       = Bits("b?????_?????_????????????_111_0010011",32)
  val ADD        = Bits("b?????_?????_?????_0000000000_0110011",32)
  val SUB        = Bits("b?????_?????_?????_1000000000_0110011",32)
  val SLL        = Bits("b?????_?????_?????_0000000001_0110011",32)
  val SLT        = Bits("b?????_?????_?????_0000000010_0110011",32)
  val SLTU       = Bits("b?????_?????_?????_0000000011_0110011",32)
  val riscvXOR   = Bits("b?????_?????_?????_0000000100_0110011",32)
  val SRL        = Bits("b?????_?????_?????_0000000101_0110011",32)
  val SRA        = Bits("b?????_?????_?????_1000000101_0110011",32)
  val riscvOR    = Bits("b?????_?????_?????_0000000110_0110011",32)
  val riscvAND   = Bits("b?????_?????_?????_0000000111_0110011",32)
  val MUL        = Bits("b?????_?????_?????_0000001000_0110011",32)
  val MULH       = Bits("b?????_?????_?????_0000001001_0110011",32)
  val MULHSU     = Bits("b?????_?????_?????_0000001010_0110011",32)
  val MULHU      = Bits("b?????_?????_?????_0000001011_0110011",32)
  val DIV        = Bits("b?????_?????_?????_0000001100_0110011",32)
  val DIVU       = Bits("b?????_?????_?????_0000001101_0110011",32)
  val REM        = Bits("b?????_?????_?????_0000001110_0110011",32)
  val REMU       = Bits("b?????_?????_?????_0000001111_0110011",32)
  val ADDIW      = Bits("b?????_?????_????????????_000_0011011",32)
  val SLLIW      = Bits("b?????_?????_000000_0_?????_001_0011011",32)
  val SRLIW      = Bits("b?????_?????_000000_0_?????_101_0011011",32)
  val SRAIW      = Bits("b?????_?????_000001_0_?????_101_0011011",32)
  val ADDW       = Bits("b?????_?????_?????_0000000000_0111011",32)
  val SUBW       = Bits("b?????_?????_?????_1000000000_0111011",32)
  val SLLW       = Bits("b?????_?????_?????_0000000001_0111011",32)
  val SRLW       = Bits("b?????_?????_?????_0000000101_0111011",32)
  val SRAW       = Bits("b?????_?????_?????_1000000101_0111011",32)
  val MULW       = Bits("b?????_?????_?????_0000001000_0111011",32)
  val DIVW       = Bits("b?????_?????_?????_0000001100_0111011",32)
  val DIVUW      = Bits("b?????_?????_?????_0000001101_0111011",32)
  val REMW       = Bits("b?????_?????_?????_0000001110_0111011",32)
  val REMUW      = Bits("b?????_?????_?????_0000001111_0111011",32)
  val LB         = Bits("b?????_?????_????????????_000_0000011",32)
  val LH         = Bits("b?????_?????_????????????_001_0000011",32)
  val LW         = Bits("b?????_?????_????????????_010_0000011",32)
  val LD         = Bits("b?????_?????_????????????_011_0000011",32)
  val LBU        = Bits("b?????_?????_????????????_100_0000011",32)
  val LHU        = Bits("b?????_?????_????????????_101_0000011",32)
  val LWU        = Bits("b?????_?????_????????????_110_0000011",32)
  val SB         = Bits("b?????_?????_?????_???????_000_0100011",32)
  val SH         = Bits("b?????_?????_?????_???????_001_0100011",32)
  val SW         = Bits("b?????_?????_?????_???????_010_0100011",32)
  val SD         = Bits("b?????_?????_?????_???????_011_0100011",32)
  val AMOADD_W   = Bits("b?????_?????_?????_0000000010_0101011",32)
  val AMOSWAP_W  = Bits("b?????_?????_?????_0000001010_0101011",32)
  val AMOAND_W   = Bits("b?????_?????_?????_0000010010_0101011",32)
  val AMOOR_W    = Bits("b?????_?????_?????_0000011010_0101011",32)
  val AMOMIN_W   = Bits("b?????_?????_?????_0000100010_0101011",32)
  val AMOMAX_W   = Bits("b?????_?????_?????_0000101010_0101011",32)
  val AMOMINU_W  = Bits("b?????_?????_?????_0000110010_0101011",32)
  val AMOMAXU_W  = Bits("b?????_?????_?????_0000111010_0101011",32)
  val AMOADD_D   = Bits("b?????_?????_?????_0000000011_0101011",32)
  val AMOSWAP_D  = Bits("b?????_?????_?????_0000001011_0101011",32)
  val AMOAND_D   = Bits("b?????_?????_?????_0000010011_0101011",32)
  val AMOOR_D    = Bits("b?????_?????_?????_0000011011_0101011",32)
  val AMOMIN_D   = Bits("b?????_?????_?????_0000100011_0101011",32)
  val AMOMAX_D   = Bits("b?????_?????_?????_0000101011_0101011",32)
  val AMOMINU_D  = Bits("b?????_?????_?????_0000110011_0101011",32)
  val AMOMAXU_D  = Bits("b?????_?????_?????_0000111011_0101011",32)
  val FENCE_I    = Bits("b?????_?????_????????????_001_0101111",32)
  val FENCE      = Bits("b?????_?????_????????????_010_0101111",32)
  val SYSCALL    = Bits("b00000_00000_00000_0000000000_1110111",32)
  val BREAK      = Bits("b00000_00000_00000_0000000001_1110111",32)
  val RDCYCLE    = Bits("b?????_00000_00000_0000000100_1110111",32)
  val RDTIME     = Bits("b?????_00000_00000_0000001100_1110111",32)
  val RDINSTRET  = Bits("b?????_00000_00000_0000010100_1110111",32)
  val EI         = Bits("b?????_00000_00000_0000000000_1111011",32)
  val DI         = Bits("b?????_00000_00000_0000000001_1111011",32)
  val MFPCR      = Bits("b?????_00000_?????_0000000010_1111011",32)
  val MTPCR      = Bits("b00000_?????_?????_0000000011_1111011",32)
  val ERET       = Bits("b00000_00000_00000_0000000100_1111011",32)
  val CFLUSH     = Bits("b00000_00000_00000_0000000101_1111011",32)
  // floating point instructions
  val FMOVZ      = Bits("b?????_?????_?????_0000010101_1110111",32)
  val FMOVN      = Bits("b?????_?????_?????_0000011101_1110111",32)
  val FADD_S     = Bits("b?????_?????_?????_00000_???_00_1010011",32)
  val FSUB_S     = Bits("b?????_?????_?????_00001_???_00_1010011",32)
  val FMUL_S     = Bits("b?????_?????_?????_00010_???_00_1010011",32)
  val FDIV_S     = Bits("b?????_?????_?????_00011_???_00_1010011",32)
  val FSQRT_S    = Bits("b?????_?????_00000_00100_???_00_1010011",32)
  val FSGNJ_S    = Bits("b?????_?????_?????_00101_000_00_1010011",32)
  val FSGNJN_S   = Bits("b?????_?????_?????_00110_000_00_1010011",32)
  val FSGNJX_S   = Bits("b?????_?????_?????_00111_000_00_1010011",32)
  val FADD_D     = Bits("b?????_?????_?????_00000_???_01_1010011",32)
  val FSUB_D     = Bits("b?????_?????_?????_00001_???_01_1010011",32)
  val FMUL_D     = Bits("b?????_?????_?????_00010_???_01_1010011",32)
  val FDIV_D     = Bits("b?????_?????_?????_00011_???_01_1010011",32)
  val FSQRT_D    = Bits("b?????_?????_00000_00100_???_01_1010011",32)
  val FSGNJ_D    = Bits("b?????_?????_?????_00101_000_01_1010011",32)
  val FSGNJN_D   = Bits("b?????_?????_?????_00110_000_01_1010011",32)
  val FSGNJX_D   = Bits("b?????_?????_?????_00111_000_01_1010011",32)
  val FCVT_L_S   = Bits("b?????_?????_00000_01000_???_00_1010011",32)
  val FCVT_LU_S  = Bits("b?????_?????_00000_01001_???_00_1010011",32)
  val FCVT_W_S   = Bits("b?????_?????_00000_01010_???_00_1010011",32)
  val FCVT_WU_S  = Bits("b?????_?????_00000_01011_???_00_1010011",32)
  val FCVT_L_D   = Bits("b?????_?????_00000_01000_???_01_1010011",32)
  val FCVT_LU_D  = Bits("b?????_?????_00000_01001_???_01_1010011",32)
  val FCVT_W_D   = Bits("b?????_?????_00000_01010_???_01_1010011",32)
  val FCVT_WU_D  = Bits("b?????_?????_00000_01011_???_01_1010011",32)
  val FCVT_S_L   = Bits("b?????_?????_00000_01100_???_00_1010011",32)
  val FCVT_S_LU  = Bits("b?????_?????_00000_01101_???_00_1010011",32)
  val FCVT_S_W   = Bits("b?????_?????_00000_01110_???_00_1010011",32)
  val FCVT_S_WU  = Bits("b?????_?????_00000_01111_???_00_1010011",32)
  val FCVT_D_L   = Bits("b?????_?????_00000_01100_???_01_1010011",32)
  val FCVT_D_LU  = Bits("b?????_?????_00000_01101_???_01_1010011",32)
  val FCVT_D_W   = Bits("b?????_?????_00000_01110_???_01_1010011",32)
  val FCVT_D_WU  = Bits("b?????_?????_00000_01111_???_01_1010011",32)
  val FCVT_S_D   = Bits("b?????_?????_00000_10001_???_00_1010011",32)
  val FCVT_D_S   = Bits("b?????_?????_00000_10000_???_01_1010011",32)
  val FEQ_S      = Bits("b?????_?????_?????_10101_000_00_1010011",32)
  val FLT_S      = Bits("b?????_?????_?????_10110_000_00_1010011",32)
  val FLE_S      = Bits("b?????_?????_?????_10111_000_00_1010011",32)
  val FEQ_D      = Bits("b?????_?????_?????_10101_000_01_1010011",32)
  val FLT_D      = Bits("b?????_?????_?????_10110_000_01_1010011",32)
  val FLE_D      = Bits("b?????_?????_?????_10111_000_01_1010011",32)
  val FMIN_S     = Bits("b?????_?????_?????_11000_000_00_1010011",32)
  val FMAX_S     = Bits("b?????_?????_?????_11001_000_00_1010011",32)
  val FMIN_D     = Bits("b?????_?????_?????_11000_000_01_1010011",32)
  val FMAX_D     = Bits("b?????_?????_?????_11001_000_01_1010011",32)
  val MFTX_S     = Bits("b?????_?????_00000_11100_000_00_1010011",32)
  val MFTX_D     = Bits("b?????_?????_00000_11100_000_01_1010011",32)
  val MFFSR      = Bits("b?????_00000_00000_11101_000_00_1010011",32)
  val MXTF_S     = Bits("b?????_?????_00000_11110_000_00_1010011",32)
  val MXTF_D     = Bits("b?????_?????_00000_11110_000_01_1010011",32)
  val MTFSR      = Bits("b?????_?????_00000_11111_000_00_1010011",32)
  val FLW        = Bits("b?????_?????_????????????_010_0000111",32)
  val FLD        = Bits("b?????_?????_????????????_011_0000111",32)
  val FSW        = Bits("b?????_?????_?????_???????_010_0100111",32)
  val FSD        = Bits("b?????_?????_?????_???????_011_0100111",32)
  val FMADD_S    = Bits("b?????_?????_?????_?????_???_00_1000011",32)
  val FMSUB_S    = Bits("b?????_?????_?????_?????_???_00_1000111",32)
  val FNMSUB_S   = Bits("b?????_?????_?????_?????_???_00_1001011",32)
  val FNMADD_S   = Bits("b?????_?????_?????_?????_???_00_1001111",32)
  val FMADD_D    = Bits("b?????_?????_?????_?????_???_01_1000011",32)
  val FMSUB_D    = Bits("b?????_?????_?????_?????_???_01_1000111",32)
  val FNMSUB_D   = Bits("b?????_?????_?????_?????_???_01_1001011",32)
  val FNMADD_D   = Bits("b?????_?????_?????_?????_???_01_1001111",32)
  // vector instructions
  val FENCE_L_V  = Bits("b?????_?????_????????????_100_0101111",32)
  val FENCE_G_V  = Bits("b?????_?????_????????????_101_0101111",32)
  val FENCE_L_CV = Bits("b?????_?????_????????????_110_0101111",32)
  val FENCE_G_CV = Bits("b?????_?????_????????????_111_0101111",32)
  val MOVZ       = Bits("b?????_?????_?????_0000000101_1110111",32)
  val MOVN       = Bits("b?????_?????_?????_0000001101_1110111",32)
  val STOP       = Bits("b00000_00000_00000_0000000010_1110111",32)
  val UTIDX      = Bits("b?????_00000_00000_0000000011_1110111",32)
  val VLD        = Bits("b?????_?????_00000_0000000011_0001011",32)
  val VLW        = Bits("b?????_?????_00000_0000000010_0001011",32)
  val VLWU       = Bits("b?????_?????_00000_0000000110_0001011",32)
  val VLH        = Bits("b?????_?????_00000_0000000001_0001011",32)
  val VLHU       = Bits("b?????_?????_00000_0000000101_0001011",32)
  val VLB        = Bits("b?????_?????_00000_0000000000_0001011",32)
  val VLBU       = Bits("b?????_?????_00000_0000000100_0001011",32)
  val VFLD       = Bits("b?????_?????_00000_0000001011_0001011",32)
  val VFLW       = Bits("b?????_?????_00000_0000001010_0001011",32)
  val VLSTD      = Bits("b?????_?????_?????_0000100011_0001011",32)
  val VLSTW      = Bits("b?????_?????_?????_0000100010_0001011",32)
  val VLSTWU     = Bits("b?????_?????_?????_0000100110_0001011",32)
  val VLSTH      = Bits("b?????_?????_?????_0000100001_0001011",32)
  val VLSTHU     = Bits("b?????_?????_?????_0000100101_0001011",32)
  val VLSTB      = Bits("b?????_?????_?????_0000100000_0001011",32)
  val VLSTBU     = Bits("b?????_?????_?????_0000100100_0001011",32)
  val VFLSTD     = Bits("b?????_?????_?????_0000101011_0001011",32)
  val VFLSTW     = Bits("b?????_?????_?????_0000101010_0001011",32)
  val VLSEGD     = Bits("b?????_?????_?????_0001000011_0001011",32)
  val VLSEGW     = Bits("b?????_?????_?????_0001000010_0001011",32)
  val VLSEGWU    = Bits("b?????_?????_?????_0001000110_0001011",32)
  val VLSEGH     = Bits("b?????_?????_?????_0001000001_0001011",32)
  val VLSEGHU    = Bits("b?????_?????_?????_0001000101_0001011",32)
  val VLSEGB     = Bits("b?????_?????_?????_0001000000_0001011",32)
  val VLSEGBU    = Bits("b?????_?????_?????_0001000100_0001011",32)
  val VFLSEGD    = Bits("b?????_?????_?????_0001001011_0001011",32)
  val VFLSEGW    = Bits("b?????_?????_?????_0001001010_0001011",32)
  val VLSEGSTD   = Bits("b?????_?????_?????_?????_100_11_0001011",32)
  val VLSEGSTW   = Bits("b?????_?????_?????_?????_100_10_0001011",32)
  val VLSEGSTWU  = Bits("b?????_?????_?????_?????_101_10_0001011",32)
  val VLSEGSTH   = Bits("b?????_?????_?????_?????_100_01_0001011",32)
  val VLSEGSTHU  = Bits("b?????_?????_?????_?????_101_01_0001011",32)
  val VLSEGSTB   = Bits("b?????_?????_?????_?????_100_00_0001011",32)
  val VLSEGSTBU  = Bits("b?????_?????_?????_?????_101_00_0001011",32)
  val VFLSEGSTD  = Bits("b?????_?????_?????_?????_110_11_0001011",32)
  val VFLSEGSTW  = Bits("b?????_?????_?????_?????_110_10_0001011",32)
  val VSD        = Bits("b?????_?????_00000_0000000011_0001111",32)
  val VSW        = Bits("b?????_?????_00000_0000000010_0001111",32)
  val VSH        = Bits("b?????_?????_00000_0000000001_0001111",32)
  val VSB        = Bits("b?????_?????_00000_0000000000_0001111",32)
  val VFSD       = Bits("b?????_?????_00000_0000001011_0001111",32)
  val VFSW       = Bits("b?????_?????_00000_0000001010_0001111",32)
  val VSSTD      = Bits("b?????_?????_?????_0000100011_0001111",32)
  val VSSTW      = Bits("b?????_?????_?????_0000100010_0001111",32)
  val VSSTH      = Bits("b?????_?????_?????_0000100001_0001111",32)
  val VSSTB      = Bits("b?????_?????_?????_0000100000_0001111",32)
  val VFSSTD     = Bits("b?????_?????_?????_0000101011_0001111",32)
  val VFSSTW     = Bits("b?????_?????_?????_0000101010_0001111",32)
  val VSSEGD     = Bits("b?????_?????_?????_0001000011_0001111",32)
  val VSSEGW     = Bits("b?????_?????_?????_0001000010_0001111",32)
  val VSSEGH     = Bits("b?????_?????_?????_0001000001_0001111",32)
  val VSSEGB     = Bits("b?????_?????_?????_0001000000_0001111",32)
  val VFSSEGD    = Bits("b?????_?????_?????_0001001011_0001111",32)
  val VFSSEGW    = Bits("b?????_?????_?????_0001001010_0001111",32)
  val VSSEGSTD   = Bits("b?????_?????_?????_?????_100_11_0001111",32)
  val VSSEGSTW   = Bits("b?????_?????_?????_?????_100_10_0001111",32)
  val VSSEGSTH   = Bits("b?????_?????_?????_?????_100_01_0001111",32)
  val VSSEGSTB   = Bits("b?????_?????_?????_?????_100_00_0001111",32)
  val VFSSEGSTD  = Bits("b?????_?????_?????_?????_110_11_0001111",32)
  val VFSSEGSTW  = Bits("b?????_?????_?????_?????_110_10_0001111",32)
  val VMVV       = Bits("b?????_?????_00000_0000000000_1110011",32)
  val VMSV       = Bits("b?????_?????_00000_0000010000_1110011",32)
  val VMST       = Bits("b?????_?????_?????_0000100000_1110011",32)
  val VMTS       = Bits("b?????_?????_?????_0000110000_1110011",32)
  val VFMVV      = Bits("b?????_?????_00000_0000000010_1110011",32)
  val VFMSV      = Bits("b?????_?????_00000_0000010010_1110011",32)
  val VFMST      = Bits("b?????_?????_?????_0000100010_1110011",32)
  val VFMTS      = Bits("b?????_?????_?????_0000110010_1110011",32)
  val VVCFGIVL   = Bits("b?????_?????_????????????_001_1110011",32)
  val VTCFGIVL   = Bits("b?????_?????_????????????_011_1110011",32)
  val VSETVL     = Bits("b?????_?????_000000000000_101_1110011",32)
  val VF         = Bits("b00000_?????_????????????_111_1110011",32)

  val NOP = ADDI & Bits("b00000000000000000000001111111111", 32)
}
