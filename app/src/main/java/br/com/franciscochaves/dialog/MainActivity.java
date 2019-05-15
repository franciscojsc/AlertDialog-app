package br.com.franciscochaves.dialog;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button mBotaoMensagem;
    private AlertDialog.Builder dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mBotaoMensagem = findViewById(R.id.button_dialog);
        mBotaoMensagem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //Criar alert dialog
                dialog = new AlertDialog.Builder(MainActivity.this);

                //Configurar o título
                dialog.setTitle("Título dialog");

                //Configurar a mensagem
                dialog.setMessage("Messagem da dialog");

                //Cancelar a dialog, ao clicar fora do dialog
                dialog.setCancelable(false);

                //Definir ícone
                dialog.setIcon(android.R.drawable.ic_delete);

                //Botão negativo
                dialog.setNegativeButton("Não", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Pressionado o botão não", Toast.LENGTH_SHORT).show();
                    }
                });

                //Botão positivo
                dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast.makeText(getApplicationContext(), "Pressionado o botão sim", Toast.LENGTH_SHORT).show();
                    }
                });

                //Criar o dialog
                dialog.create();

                //Exibindo a dialog
                dialog.show();
            }
        });

    }
}
