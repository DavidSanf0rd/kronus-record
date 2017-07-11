package Annotation

/**
 * Created by sanf0rd on 19/06/17.
 */

/**
 * Annotation to mark a field as unique
 */
@Retention(AnnotationRetention.RUNTIME)
@Target(AnnotationTarget.FIELD)
annotation class Unique()