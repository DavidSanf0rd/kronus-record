import Core.interfaces.DBEntity
import javax.xml.crypto.Data
import kotlin.reflect.full.declaredMemberProperties
import kotlin.reflect.full.instanceParameter
import kotlin.reflect.full.memberProperties
import kotlin.reflect.jvm.isAccessible
import kotlin.reflect.jvm.javaField
import kotlin.reflect.jvm.kotlinProperty
import kotlin.reflect.jvm.reflect

/**
 * Created by victoralisson on 19/06/17.
 */

open interface Writeable<T: DataModel>: Referable, DBEntity {
    fun save() {
        this.context?.save(this)
    }
}

