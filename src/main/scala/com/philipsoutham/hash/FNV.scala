package com.philipsoutham.hash

object FNV {

  private val INIT32 = BigInt("811c9dc5", 16);
  private val INIT64 = BigInt("cbf29ce484222325", 16);
  private val PRIME32 = BigInt("01000193", 16);
  private val PRIME64 = BigInt("100000001b3", 16);
  private val MOD32 = BigInt("2").pow(32);
  private val MOD64 = BigInt("2").pow(64);
  private val Z = 0xff

  @inline private def calc(prime: BigInt, mod: BigInt)(hash: BigInt, b: Byte): BigInt = ((hash * prime) % mod) ^ (b & Z)
  @inline private def calcA(prime: BigInt, mod: BigInt)(hash: BigInt, b: Byte): BigInt = ((hash ^ (b & Z)) * prime) % mod

  @inline def hash32(data: Array[Byte]): BigInt = data.foldLeft(INIT32)(calc(PRIME32, MOD32))
  @inline def hash32a(data: Array[Byte]): BigInt = data.foldLeft(INIT32)(calcA(PRIME32, MOD32))

  @inline def hash64(data: Array[Byte]): BigInt = data.foldLeft(INIT64)(calc(PRIME64, MOD64))
  @inline def hash64a(data: Array[Byte]): BigInt = data.foldLeft(INIT64)(calcA(PRIME64, MOD64))
}
