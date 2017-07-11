package Extensions

import com.eclipsesource.json.Json
import com.eclipsesource.json.JsonObject
import com.google.gson.Gson
import com.google.gson.GsonBuilder

/**
 * Created by sanf0rd on 10/07/17.
 */

val objectToJsonConverter: Gson = GsonBuilder().create()

val Any.json: JsonObject
    get() = Json.parse(objectToJsonConverter.toJson(this)).asObject()