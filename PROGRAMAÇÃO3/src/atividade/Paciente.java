package atividade;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Paciente {
	
	private int codigo;
	private String nome;
	private String endereco;
	private String CEP;
	private String telefone;
	private Date dataNascimento;
	private String RG;
	private String CPF;
	private Cidade cidade = new Cidade();

 public int getCodigo(){
 return codigo;
}
 
public void setCodigo(int codigo) {
 this.codigo = codigo;
}

public String getNome() {
 return nome;
}

public void setNome(String nome) {
 this.nome = nome;
}

public String getEndereco() {
 return endereco;
}

public void setEndereco(String endereco) {
 this.endereco = endereco;
}

public String getCEP() {
 return CEP;
}

public void setCEP(String CEP) {
 this.CEP = CEP;
}
public String getTelefone() {
 return telefone;
}

public void setTelefone(String telefone) {
 this.telefone = telefone;
}

public Date getDataNascimento() {
 return dataNascimento;
}

public void setDataNascimento(Date dataNascimento) {
 this.dataNascimento = dataNascimento;
}
public String getRG() {
 return RG;
}
public void setRG(String RG) {
 this.RG = RG;
}
public String getCPF() {
 return CPF;
}
public void setCPF(String CPF) {
 this.CPF = CPF;
}
public Cidade getCidade() {
 return cidade;
}
public void setCidade(Cidade cidade) {
 this.cidade = cidade;
}
public void cadastrar() throws ParseException {
 Scanner tec = new Scanner(System.in);
 System.out.println("Informe os dados do Paciente");
 System.out.print("Nome: ");
 this.setNome(tec.nextLine());
 System.out.print("Endereço: ");
 this.setEndereco(tec.nextLine());
 System.out.print("CEP: ");
 this.setCEP(tec.nextLine());
 System.out.print("Telefone: ");
 this.setTelefone(tec.nextLine());
 System.out.print("Data de Nascimento Ex: [02/12/1982]:");
 String dataRecebida = tec.nextLine();

 SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
 Date dt = df.parse(dataRecebida);
 this.setDataNascimento(dt);

 System.out.print("RG: ");
 this.setRG(tec.nextLine());
 System.out.print("CPF: ");
 this.setCPF(tec.nextLine());cidade.cadastrar();
}
public void imprimirPaciente(){
 SimpleDateFormat formataData= new SimpleDateFormat("dd/MM/yyyy");
 String stringData = formataData.format(this.getDataNascimento());
 System.out.println("Paciente: "+this.getNome());
 System.out.println("Endereço: "+this.getEndereco());
 System.out.println("CEP: "+this.getCEP());
 System.out.println("Telefone: "+this.getTelefone());

 System.out.println("Data de Nascimento: "+stringData);
 System.out.println("RG: "+this.getRG());
 System.out.println("CPF: "+this.getCPF());
 cidade.imprimirCidade();
}
public void listarPaciente(){
 System.out.print(" | " +this.getCPF());
 System.out.print(" | " +this.getNome());
}
}