package gabreezus.com.br

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_rollo.*

class RolloActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rollo)

        Log.d("Aviso!", "Criando... RolloActivity")

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

    }

    private fun redireciona(op: Int) {

        val bundle = Bundle()
        val frase = "Você chegou neste personagem através do personagem Rollo"
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
        Log.d("Aviso!", "Iniciando... RolloActivity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Aviso!", "Resumindo... RolloActivity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Aviso!", "Reiniciando... RolloActivity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Aviso!", "Parando... RolloActivity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Aviso!", "Destruindo... RolloActivity")
    }
}
