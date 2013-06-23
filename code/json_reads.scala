case class User(firstName: String, lastName: String)

val userFormat = Json.format[User]