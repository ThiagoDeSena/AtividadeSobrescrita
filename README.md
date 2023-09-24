# AtividadeSobrescrita
Programa em Java de um sistema Hospitalar utilizando Sobrescrita

Sistema hospitalar

Crie um sistema hospitalar simplificado para realizar o cadastro de pacientes e equipe médica. Este sistema deve conter as classes a seguir: Pessoa, Paciente, Medico e Hospital. Observe o uso de composição e herança.

Informações e comportamentos que devem estar contidas em cada classe:


Pessoa:
nome
endereço
idade
cpf
sexo
Uma pessoa pode andar

Paciente (é uma Pessoa):
doença;
medicação
Um paciente pode sentir dor
Um paciente pode ter alta

Médico (é uma Pessoa):
crm
salário
especialização
Um médico pode dar plantão
 
Hospital:
nome
endereço


Adicionalmente, cada classe deve conter um método chamado void imprimirValores(), que é responsável por imprimir os atributos da classe. Este método deve ser declarado em Pessoa e sobrescrito nas subclasses.
