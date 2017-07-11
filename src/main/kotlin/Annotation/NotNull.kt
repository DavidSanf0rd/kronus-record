package Annotation

/**
 * Created by sanf0rd on 19/06/17.
 */
/**
 * Annotation to mark a field not to be null
 */
@Target(AnnotationTarget.FIELD)
@Retention(AnnotationRetention.RUNTIME)
annotation class NotNull()