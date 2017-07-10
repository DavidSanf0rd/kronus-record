package Annotation

/**
 * Created by sanf0rd on 19/06/17.
 */
/**
 * Annotation to mark a field auto increment enabled
 */
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class AutoIncrement()