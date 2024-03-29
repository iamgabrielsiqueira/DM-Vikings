package gabreezus.com.br

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Aviso!", "Criando... Main Activity")

        imgBtRagnar.setOnClickListener {
            redireciona(1)
        }

        imgBtLagertha.setOnClickListener {
            redireciona(2)
        }

        imgBtRollo.setOnClickListener {
            redireciona(3)
        }

        imgBtFloki.setOnClickListener {
            redireciona(4)
        }

        imgBtAthelstan.setOnClickListener {
            redireciona(5)
        }

        imgBtBjorn.setOnClickListener {
            redireciona(6)
        }

    }

    private fun redireciona(op : Int) {

        val bundle = Bundle()
        val frase = ""
        with(bundle) {
            putString("frase", frase)
        }

        if(op == 1) {
            val intent = Intent(this, RagnarActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        } else if(op == 2) {
            val intent = Intent(this, LagerthaActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        } else if(op == 3) {
            val intent = Intent(this, RolloActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        } else if(op == 4) {
            val intent = Intent(this, FlokiActivity::class.java)
            intent.putExtras(bundle)
            intent.putExtras(bundle)
            startActivity(intent)
        } else if(op == 5) {
            val intent = Intent(this, AthelstanActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        } else if(op == 6) {
            val intent = Intent(this, BjornActivity::class.java)
            intent.putExtras(bundle)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("Aviso!", "Iniciando... Main Activity")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Aviso!", "Resumindo... Main Activity")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Aviso!", "Reiniciando... Main Activity")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Aviso!", "Parando... Main Activity")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Aviso!", "Destruindo... Main Activity")
    }
}
