package uz.ilhomjon.mytoastlib

import android.content.Context
import android.widget.Toast

object ToastMessage {
    fun show(context: Context, message:String){
        Toast.makeText(context, "Ilhomjon : $message", Toast.LENGTH_SHORT).show()
    }
}