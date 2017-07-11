/**
 * Created by victoralisson on 19/06/17.
 */

interface Updatable<T: DataModel> {
    fun update() {
        println("Agora estamos atualizando o Usuário")
    }
}