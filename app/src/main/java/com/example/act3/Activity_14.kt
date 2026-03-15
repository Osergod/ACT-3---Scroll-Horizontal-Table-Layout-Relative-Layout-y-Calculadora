class Activity_14 : AppCompatActivity() {

    lateinit var num1: EditText
    lateinit var num2: EditText
    lateinit var txtResultat: TextView
    var operador = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_14)

        num1 = findViewById(R.id.num1)
        num2 = findViewById(R.id.num2)
        txtResultat = findViewById(R.id.txtResultat)

        val btnSuma = findViewById<Button>(R.id.btnSuma)
        val btnResta = findViewById<Button>(R.id.btnResta)
        val btnMulti = findViewById<Button>(R.id.btnMulti)
        val btnDiv = findViewById<Button>(R.id.btnDiv)
        val btnIgual = findViewById<Button>(R.id.btnIgual)

        btnSuma.setOnClickListener { operador = "+" }
        btnResta.setOnClickListener { operador = "-" }
        btnMulti.setOnClickListener { operador = "x" }
        btnDiv.setOnClickListener { operador = "/" }

        btnIgual.setOnClickListener {
            val a = num1.text.toString().toDouble()
            val b = num2.text.toString().toDouble()
            var resultado = 0.0

            when (operador) {
                "+" -> resultado = a + b
                "-" -> resultado = a - b
                "x" -> resultado = a * b
                "/" -> resultado = a / b
            }

            txtResultat.text = resultado.toString()
        }
    }
}