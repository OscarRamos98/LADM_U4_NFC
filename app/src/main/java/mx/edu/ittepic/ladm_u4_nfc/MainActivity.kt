package mx.edu.ittepic.ladm_u4_nfc

import android.nfc.NfcAdapter
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var nfcAdapter : NfcAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button.setOnClickListener {
            textView.setText("Soporta NFC: "+(nfcAdapter != null).toString())
            textView2.setText("NFC Activado: "+(nfcAdapter?.isEnabled).toString())
        }
    }
}
