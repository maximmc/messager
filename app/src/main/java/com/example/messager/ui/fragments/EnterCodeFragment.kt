package com.example.messager.ui.fragments

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.messager.R
import kotlinx.android.synthetic.main.fragment_enter_code.*

class EnterCodeFragment : Fragment(R.layout.fragment_enter_code) {
    override fun onStart() {
        super.onStart()
        edit_text_enter_code.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {
                val string = edit_text_enter_code.text.toString()
                if(string.length == 6) {
                    verifyCode()
                }
            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {

            }

        })
    }

    private fun verifyCode() {
        Toast.makeText(activity, getString(R.string.register_toast_code_accepted), Toast.LENGTH_SHORT).show()
    }
}