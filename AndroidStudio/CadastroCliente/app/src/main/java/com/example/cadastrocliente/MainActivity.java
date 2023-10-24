package com.example.cadastrocliente;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class MainActivity extends AppCompatActivity {

    private DatabaseReference CadastroCliente = FirebaseDatabase.getInstance().getReference("clientes");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");

        CadastroCliente.child ("001").child("nome").setValue("Vinicius Telles");
        CadastroCliente.child ("001").child("E_mail").setValue("vinicius@etec.com");
        CadastroCliente.child ("001").child("Celular").setValue("11911111111");
        CadastroCliente.child ("001").child("telefone").setValue("1121111111");
        CadastroCliente.child ("001").child("Endereço").setValue("Rua 1");
        CadastroCliente.child("001").child("Complemento").setValue("A");
        CadastroCliente.child("001").child("Estado").setValue("SP");
        CadastroCliente.child("001").child("Cidade").setValue("São Paulo");
        CadastroCliente.child("001").child("CEP").setValue("0100001");
        CadastroCliente.child("001").child("Status").setValue("Ativo");

        CadastroCliente.child ("002").child("nome").setValue("Darkynsky");
        CadastroCliente.child ("002").child("E_mail").setValue("darkynsky@gmail.com");
        CadastroCliente.child ("002").child("Celular").setValue("11911111112");
        CadastroCliente.child ("002").child("telefone").setValue("1121111112");
        CadastroCliente.child ("002").child("Endereço").setValue("Rua 2");
        CadastroCliente.child("002").child("Complemento").setValue("B");
        CadastroCliente.child("002").child("Estado").setValue("SP");
        CadastroCliente.child("002").child("Cidade").setValue("São Paulo");
        CadastroCliente.child("002").child("CEP").setValue("0020002");
        CadastroCliente.child("002").child("Status").setValue("Ativo");

        CadastroCliente.child ("003").child("nome").setValue("Darkyn");
        CadastroCliente.child ("003").child("E_mail").setValue("Darkyn@gmail.com");
        CadastroCliente.child ("003").child("Celular").setValue("11911111113");
        CadastroCliente.child ("003").child("telefone").setValue("1121111113");
        CadastroCliente.child ("003").child("Endereço").setValue("Rua 3");
        CadastroCliente.child("003").child("Complemento").setValue("A");
        CadastroCliente.child("003").child("Estado").setValue("SP");
        CadastroCliente.child("003").child("Cidade").setValue("São Paulo");
        CadastroCliente.child("003").child("CEP").setValue("0030003");
        CadastroCliente.child("003").child("Status").setValue("Inativo");

        CadastroCliente.child ("004").child("nome").setValue("Pessoa4");
        CadastroCliente.child ("004").child("E_mail").setValue("pessoa4@etec.com");
        CadastroCliente.child ("004").child("Celular").setValue("11911111144");
        CadastroCliente.child ("004").child("telefone").setValue("1121111144");
        CadastroCliente.child ("004").child("Endereço").setValue("Rua 4");
        CadastroCliente.child("004").child("Complemento").setValue("D");
        CadastroCliente.child("004").child("Estado").setValue("SP");
        CadastroCliente.child("004").child("Cidade").setValue("São Paulo");
        CadastroCliente.child("004").child("CEP").setValue("0400440");
        CadastroCliente.child("004").child("Status").setValue("Inativo");

        CadastroCliente.child ("005").child("nome").setValue("Pessoa5");
        CadastroCliente.child ("005").child("E_mail").setValue("pessoa5@etec.com");
        CadastroCliente.child ("005").child("Celular").setValue("11911123144");
        CadastroCliente.child ("005").child("telefone").setValue("1121251144");
        CadastroCliente.child ("005").child("Endereço").setValue("Rua 1");
        CadastroCliente.child("005").child("Complemento").setValue("B");
        CadastroCliente.child("005").child("Estado").setValue("SP");
        CadastroCliente.child("005").child("Cidade").setValue("São Paulo");
        CadastroCliente.child("005").child("CEP").setValue("0405445");
        CadastroCliente.child("005").child("Status").setValue("Inativo");


        CadastroCliente.child ("006").child("nome").setValue("Pessoa4");
        CadastroCliente.child ("006").child("E_mail").setValue("pessoa4@etec.com");
        CadastroCliente.child ("006").child("Celular").setValue("11911111144");
        CadastroCliente.child ("006").child("telefone").setValue("1121111144");
        CadastroCliente.child ("006").child("Endereço").setValue("Rua 4");
        CadastroCliente.child("006").child("Complemento").setValue("D");
        CadastroCliente.child("006").child("Estado").setValue("SP");
        CadastroCliente.child("006").child("Cidade").setValue("São Paulo");
        CadastroCliente.child("006").child("CEP").setValue("0400440");
        CadastroCliente.child("006").child("Status").setValue("Inativo");



    }
}