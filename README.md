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
### Tests
Test cases were taken from [here](http://www.isthe.com/chongo/src/fnv/test_fnv.c).
```shell
$ sbt test
...
[info] FNVSpec:
[info] Test data
[info] - must have 148 items
[info] FNV hash32
[info] - must match reference data
[info] FNV hash32a
[info] - must match reference data
[info] FNV hash64
[info] - must match reference data
[info] FNV hash64a
[info] - must match reference data
[info] Run completed in 279 milliseconds.
[info] Total number of tests run: 5
[info] Suites: completed 1, aborted 0
[info] Tests: succeeded 5, failed 0, canceled 0, ignored 0, pending 0
[info] All tests passed.
[success] Total time: 1 s, completed Oct 8, 2015 12:22:17 AM

# --OR--
$ mvn test
...
[INFO] --- maven-surefire-plugin:2.7:test (default-test) @ scala-fnv_2.11 ---
[INFO] Tests are skipped.
[INFO] 
[INFO] --- scalatest-maven-plugin:1.0:test (test) @ scala-fnv_2.11 ---
Discovery starting.
Discovery completed in 122 milliseconds.
Run starting. Expected test count is: 5
FNVSpec:
Test data
- must have 148 items
FNV hash32
- must match reference data
FNV hash32a
- must match reference data
FNV hash64
- must match reference data
FNV hash64a
- must match reference data
Run completed in 203 milliseconds.
Total number of tests run: 5
Suites: completed 2, aborted 0
Tests: succeeded 5, failed 0, canceled 0, ignored 0, pending 0
All tests passed.
[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 1.397 s
[INFO] Finished at: 2015-10-08T00:23:09-07:00
[INFO] Final Memory: 11M/290M
[INFO] ------------------------------------------------------------------------

```

<a href='https://bintray.com/philipsoutham/maven/scala-fnv/view?source=watch' alt='Get automatic notifications about new "scala-fnv" versions'><img src='https://www.bintray.com/docs/images/bintray_badge_color.png'></a>
