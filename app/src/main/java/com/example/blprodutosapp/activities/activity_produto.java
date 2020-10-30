package com.example.blprodutosapp.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import com.example.blprodutosapp.R;
import com.example.blprodutosapp.model.Produto;

public class activity_produto extends AppCompatActivity {

    private EditText editNomeProduto;
    private EditText editQuantidadeProduto;
    private EditText editPrecoProduto;
    private Button buttonSalvarProduto;
    private Produto produto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_produto);

        editNomeProduto= (EditText) findViewById(R.id.editNomeProduto);
        editPrecoProduto= (EditText) findViewById(R.id.editPrecoProduto);
        editQuantidadeProduto= (EditText) findViewById(R.id.editQuantidadeProduto);
        buttonSalvarProduto= (Button) findViewById(R.id.buttonSalvarProduto);
    }
    private Produto getDadosProdutosDoFormulario(){
        this.produto = new Produto();
        if(this.editNomeProduto.getText().toString().isEmpty() == false) {
            this.produto.setNome(this.editNomeProduto.getText().toString());
        }else{
            return null;
        }
        if(editQuantidadeProduto.getText().toString() == false) {
            int quantidadeProduto = Integer.parseInt(this.editQuantidadeProduto.getText().toString());
            this.produto.setQuantidadeEmEstoque(quantidadeProduto);
        }else{
            return null;
        }
        if(editPrecoProduto.getText().toString() == false){
            double precoProduto = Double.parseDouble(this.editQuantidadeProduto.getText().toString());
            this.produto.setPreço(precoProduto);
        }else{
            return null;
        }
        return produto;
    }
}