package throws

final class Throws[E]

object Throws {
  def throwChecked[E <: Throwable : Throws](a: E) = throw a
}
