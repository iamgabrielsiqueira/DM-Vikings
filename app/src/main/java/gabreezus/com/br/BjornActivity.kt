package gabreezus.com.br

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_bjorn.*

class BjornActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bjorn)

        Log.d("Aviso!", "Criando... BjornActivity")

        txtAviso.text = if (savedInstanceState == null) {
            intent.extras.getString("frase")
        } else {
            savedInstanceState.getString("frase")
        }

        imgLogo.setOnClickListener {
            redireciona(1)
        }

        img001.setOnClickListener {
            redireciona(2)
        }

        img008.setOnClickListener {
            redireciona(3)
        }

        img003.setOnClickListener {
            redireciona(4)
        }

        img009.setOnClickListener {
            redireciona(5)
        }
    }

    private fun redireciona(op: Int) {

        val bundle = Bundle()
        val frase = "Você chegou neste personagem através do personagem Bjorn Ironside"
        with(bundle) {
            putString("frase", frase)
        }

        if(op == 1) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else if(op == 2) {
            val intent = Intent(this, LagerthaActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        } else if(op == 3) {
            val intent = Intent(this, RagnarActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        } else if(op == 4) {
            val intent = Intent(this, FlokiActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        } else if(op == 5) {
            val intent = Intent(this, AthelstanActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        with(outState) {
            putString("frase", txtAviso.text.toString())
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Aviso!", "Iniciando... BjornActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Aviso!", "Resumindo... BjornActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Aviso!", "Reiniciando... BjornActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Aviso!", "Parando... BjornActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Aviso!", "Destruindo... BjornActivity")
    }
}
