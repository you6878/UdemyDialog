package com.bpplatform.howldialog

import android.content.DialogInterface
import android.os.Bundle
import android.support.v7.app.AlertDialog
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button.setOnClickListener {

            showDialog()
        }
    }
    fun showDialog(){
        var builder = AlertDialog.Builder(this)
        builder.setTitle("알림")
        builder.setMessage("앱을 종료 하시겠습니까?")
        builder.setPositiveButton("예", DialogInterface.OnClickListener { dialogInterface, i ->
            onBackPressed()
        })
        builder.setNegativeButton("아니오", DialogInterface.OnClickListener { dialogInterface, i ->
            dialogInterface.dismiss()

        }).show()

    }
}
