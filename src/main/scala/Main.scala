import exception.HttpException
import throws.Throws

object Main {
  def throwHttpException(a: String)(implicit T: Throws[HttpException] = new Throws[HttpException]) = {
    Throws.throwChecked(new HttpException)
    Throws.throwChecked(new RuntimeException)
  }

  def main(args: Array[String]): Unit = {
    throwHttpException("http://google.com")
  }
}
