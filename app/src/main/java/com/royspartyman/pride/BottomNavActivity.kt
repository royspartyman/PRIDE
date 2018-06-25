package com.royspartyman.pride

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import com.google.android.material.bottomappbar.BottomAppBar
import kotlinx.android.synthetic.main.activity_bottom_nav.*


class BottomNavActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_nav)


        bottom_appbar.replaceMenu(R.menu.navigation)

        toggle_alignment.setOnClickListener {
            bottom_appbar.toggleAlignment()
        }

        bottom_appbar.setOnMenuItemClickListener(object : MenuItem.OnMenuItemClickListener, Toolbar.OnMenuItemClickListener {
            override fun onMenuItemClick(item: MenuItem): Boolean {
                startActivity(Intent(this@BottomNavActivity, LoginActivity::class.java))
                return true
            }
        })
    }

    fun BottomAppBar.toggleAlignment() {
        val current = fabAlignmentMode
        fabAlignmentMode = current.xor(1)
    }
}