val json = Json.obj(
  "firstName" -> "max", "latsName" -> "Mustermann", "age" -> 17)

val addUserRole = JsPath.json.update(
  (JsPath \ "role").json.put(JsString("User")))
// addUserRole : Reads[JsObject]

val isMajor = 
  (JsPath \ "age").read[Int](min(18))      
//> isMajor : Reads[Int]

json.transform(addUserRole)
//> res0: JsResult[JsObject] = 
//    JsSuccess({
//      "firstName":"max",
//      "latsName":"Mustermann",
//      "age":17,
//      "role":"User"},)

json.validate(isMajor)
//> res1: JsResult[Int] = 
//    JsError(List((
//      /age,List(
//        ValidationError(validate.error.min,WrappedArray(18))))))