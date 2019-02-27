package com.example.anchieta.appfsaest;

    public class Usuario {

        private String nome;
        private String sexo;

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getSexo() {
            return sexo;
        }

        public void setSexo(String sexo) {
            this.sexo = sexo;
        }

        public int getIdade() {
            return Idade;
        }

        public void setIdade(int idade) {
            Idade = idade;
        }

        public Usuario(String nome, String sexo, int idade) {

            this.nome = nome;
            this.sexo = sexo;
            Idade = idade;
        }

        private int Idade;
}
