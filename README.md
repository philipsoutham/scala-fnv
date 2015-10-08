# scala-fnv
Implements FNV-1 and FNV-1a, non-cryptographic hash functions created by Glenn Fowler, Landon Curt Noll, and Phong Vo. 
See http://en.wikipedia.org/wiki/Fowler%E2%80%93Noll%E2%80%93Vo_hash_function. 

```scala
import com.philipsoutham.hash.FNV

val data = "Hello, world!".getBytes

FNV.hash32(data)  // BigInt = 3897470310
FNV.hash32a(data) // BigInt = 3985698964
FNV.hash64(data)  // BigInt = 7285062107457560934
FNV.hash64a(data) // BigInt = 4094109891673226228
```

Test cases were taken from [here](http://www.isthe.com/chongo/src/fnv/test_fnv.c).

<a href='https://bintray.com/philipsoutham/maven/scala-fnv/view?source=watch' alt='Get automatic notifications about new "scala-fnv" versions'><img src='https://www.bintray.com/docs/images/bintray_badge_color.png'></a>
