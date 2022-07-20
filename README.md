
# Estrutura metálica

Exercício de POO em Java utilizando os conceitos de herança, polimorfismo, interface e classes abstratas

## Descrição do problema

Um engenheiro deseja calcular diversas informações sobre uma estrutura metálica. Esta estrutura
é composta de diversas partes mais elementares cujos formatos são: cilindro, cubo e
paralelepípedo. Desenvolva um programa Java GUI chamado EM, de Estrutura Metálica, que leia
os seguintes dados sobre cada peça componente:

* tipo de peça (cilindro, cubo ou paralelepípedo);
* quantidade de cada peça que compõem a estrutura metálica;
* material da peça (ferro ou alumínio);
* dimensões da peça de acordo com o seu tipo:
1- Cilindro: raio e altura;  
2- Cubo: aresta;  
3- Paralelepípedo: altura, largura e profundidade.

Calcule e apresente para o engenheiro as seguintes informações:
1. O peso total da estrutura.
2. O volume total da estrutura.
3. O número de latas de tinta necessárias para pintar a estrutura metálica.
4. O volume total dos cilindros, cubos e paralelepípedos.
5. Um relatório com todas as informações dos itens 1 a 4.
  


O relatório deve ser exibido em uma
caixa de diálogo usando os componentes Swing JTextArea e JScrollPane.  
Considere os seguintes dados para o desenvolvimento do programa:  

a) Peso específico do ferro: 7,8 g/m3  
b) Peso específico do alumínio: 2,7 g/m3  
c) Toda as dimensões devem ser representadas em metros.  
d) O consumo de tinta é de 0,5 l/m2

se o material for alumínio e 0,7 l/m2 se for ferro.

e) As latas de tintas disponíveis no mercado possui as seguintes capacidades: 0,5 litro, 2 litros e
5 litros.  
f) As fórmulas dos volumes de cada peça são:  

Cubo  volume = aresta3  
Cilindro  volume =  * raio2 * altura  
Paralelepípedo  volume = altura * largura * profundidade 

g) As fórmulas das áreas de cada peça são:  

Cubo  área = 6 * aresta2  
Cilindro  área = 2 *  * raio (raio + altura)  
Paralelepípedo  área = 2 * (altura * largura + altura * profundidade + largura * profundidade)
