package gabreezus.com.br

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_lagertha.*

class LagerthaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lagertha)

        Log.d("Aviso!", "Criando... LagerthaActivity")

        txtAviso.text = if (savedInstanceState == null) {
            intent.extras.getString("frase")
        } else {
            savedInstanceState.getString("frase")
        }

        imgLogo.setOnClickListener {
            redireciona(1)
        }

        img004.setOnClickListener {
            redireciona(2)
        }

        img005.setOnClickListener {
            redireciona(3)
        }
    }

    private fun redireciona(op: Int) {

        val bundle = Bundle()
        val frase = "Você chegou neste personagem através do personagem Lagertha"
        with(bundle) {
            putString("frase", frase)
        }

        if(op == 1) {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        } else if(op == 2) {
            val intent = Intent(this, BjornActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        } else if(op == 3) {
            val intent = Intent(this, RagnarActivity::class.java)
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
        Log.d("Aviso!", "Iniciando... LagerthaActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Aviso!", "Resumindo... LagerthaActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Aviso!", "Reiniciando... LagerthaActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Aviso!", "Parando... LagerthaActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Aviso!", "Destruindo... LagerthaActivity")
    }
}
