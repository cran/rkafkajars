/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2010, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */


// generated by genprod on Thu Apr 29 17:52:16 CEST 2010  (with extra methods)

package scala




/** <p>
 *    Function with 8 parameters.
 *  </p>
 *  
 */
trait Function8[-T1, -T2, -T3, -T4, -T5, -T6, -T7, -T8, +R] extends AnyRef { self =>
  def apply(v1:T1,v2:T2,v3:T3,v4:T4,v5:T5,v6:T6,v7:T7,v8:T8): R
  override def toString() = "<function8>"
  
  /** f(x1, x2, x3, x4, x5, x6, x7, x8)  == (f.curried)(x1)(x2)(x3)(x4)(x5)(x6)(x7)(x8)
   */
  def curried: T1 => T2 => T3 => T4 => T5 => T6 => T7 => T8 => R = {
    (x1: T1) => ((x2: T2, x3: T3, x4: T4, x5: T5, x6: T6, x7: T7, x8: T8) => self.apply(x1, x2, x3, x4, x5, x6, x7, x8)).curried
  }
  @deprecated("Use 'curried' instead")
  def curry = curried

  /* f(x1, x2, x3, x4, x5, x6, x7, x8) == (f.tupled)(Tuple8(x1, x2, x3, x4, x5, x6, x7, x8))
   */
  def tupled: Tuple8[T1, T2, T3, T4, T5, T6, T7, T8] => R = {
    case Tuple8(x1, x2, x3, x4, x5, x6, x7, x8) => apply(x1, x2, x3, x4, x5, x6, x7, x8)
  }

}