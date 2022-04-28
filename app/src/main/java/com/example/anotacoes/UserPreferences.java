package com.example.anotacoes;

import android.content.Context;
import android.content.SharedPreferences;

public class UserPreferences {
    private Context context;
    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private static String NOME_ARQUIVO = "ARQUIVO";
    private static String NOME_CAMPO = "ANOTACAO";

    public UserPreferences(Context c) {
        this.context = c;
        preferences = context.getSharedPreferences(NOME_ARQUIVO, 0);
        editor = preferences.edit();
    }

    public void salvarAnotacao(String anotacao){
        editor.putString(NOME_CAMPO, anotacao);
        editor.commit();
    }

    public String carregarAnotacao(){
        String anotacao = preferences.getString(NOME_CAMPO, "");
        return anotacao;
    }
}
