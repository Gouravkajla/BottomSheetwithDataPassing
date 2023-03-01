package com.gaurav.bottomsheetwithdatapassing

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.gaurav.bottomsheetwithdatapassing.databinding.ActivityMainBinding
import com.gaurav.bottomsheetwithdatapassing.databinding.BottomSheetBinding
import com.google.android.material.bottomsheet.BottomSheetDialog

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnchangeName.setOnClickListener {
            var dialog=BottomSheetDialog(this)
            var dialogBinding=BottomSheetBinding.inflate(layoutInflater)
            dialog.setContentView(dialogBinding.root)
            dialogBinding.etInputtext.setText(binding.tvOutputtext.text.toString())

            dialogBinding.btnsubmit.setOnClickListener {
                if (dialogBinding.etInputtext.text.isEmpty()){
                    dialogBinding.etInputtext.error="Enter Your Text"
                }else{
                    binding.tvOutputtext.setText(dialogBinding.etInputtext.text.toString())


                   dialog.dismiss()
                }


            }

            dialog.show()
        }
    }
}