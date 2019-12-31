package com.example.redma.ourmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.ContextMenu
import android.view.Menu
import android.view.MenuItem
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //コンテキストメニューを表示させるビューを登録
        registerForContextMenu(menuImage)
    }

    //メニューを表示させる
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main, menu)
        return true
    }

    //メニュー内のアイテムクリックしたときの動作⇒画像を表示させる
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item?.itemId) {
            R.id.home -> {
                menuImage.setImageResource(R.drawable.cheesedon)
                menuText.text = ""
                return true
            }
            R.id.beefcurry -> {
                menuImage.setImageResource(R.drawable.beefcurry)
                menuText.text = getString(R.string.beefcurry_text)
                return true
            }
            R.id.katsucurry -> {
                menuImage.setImageResource(R.drawable.katsucurry)
                menuText.text = getString(R.string.katsucurry_text)
                return true
            }
            R.id.nabeyaki -> {
                menuImage.setImageResource(R.drawable.nabeyaki)
                menuText.text = getString(R.string.nabeyaki_text)
                return true
            }
            R.id.hiyashi -> {
                menuImage.setImageResource(R.drawable.hiyashi)
                menuText.text = getString(R.string.hiyashi_text)
                return true
            }
            R.id.oden -> {
                menuImage.setImageResource(R.drawable.oden)
                menuText.text = getString(R.string.oden_text)
                return true
            }
            R.id.hiroshima -> {
                menuImage.setImageResource(R.drawable.hiroshima)
                menuText.text = getString(R.string.hiroshima_text)
                return true
            }
            R.id.hayashi -> {
                menuImage.setImageResource(R.drawable.hayashi)
                menuText.text = getString(R.string.hayashi_text)
                return true
            }
            R.id.ankake -> {
                menuImage.setImageResource(R.drawable.ankake)
                menuText.text = getString(R.string.ankake_text)
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

    //menuImage長押しでコンテキストメニューを表示させる処理
    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)

        //料理が選択されているときのみメニューを表示⇒選択済みの料理をメールなどで共有するため
        if (menuText.text.isNotEmpty()){
            menuInflater.inflate(R.menu.context,menu)   //((表示させるmenuのXMLファイル,XMLファイルのどのビューか)
        }
    }
}
