package output

import entity.UserEntity

interface IOutputInfo {

    fun showMessage(message: String, lineBreak: Boolean = true)
    fun show(userList: List<UserEntity>?, message: String = "All users:")

}