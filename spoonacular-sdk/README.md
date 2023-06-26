
# Projeto 1 - Spoonacular API

# O Projeto

Este projeto consome a **Spoonacular API**, e pode:

 - Gerar planos de refeição
 - Obter informações sobre determinado item - por id
 - Pesquisar informações sobre determinado item de menu - por nome
 - Obter uma piada aleatória sobre comida
 - Obter uma curiosidade aleatória sobre comida
 - Obter uma receita aleatória
 - Obter a descrição de um vinho
 - Exibir um prato compatível com determinado vinho
 - Recomendar um vinho de acordo com seu tipo e preço
 - Exibir um vinho compatível com determinado prato

# Os Endpoints

A aplicação utiliza ao todo 10 endpoints, sendo eles:

 - Generate Meal Plan - https://api.spoonacular.com/mealplanner/generate
 - Get Menu Item Information - https://api.spoonacular.com/food/menuItems/{id}
 - Search Menu Items - https://api.spoonacular.com/food/menuItems/search
 - Random Food Joke - https://api.spoonacular.com/food/jokes/random
 - Random Food Trivia - https://api.spoonacular.com/food/trivia/random
 - Get Random Recipe - https://api.spoonacular.com/recipes/random
 - Wine Description - https://api.spoonacular.com/food/wine/description
 - Dish Pairing for Wine - https://api.spoonacular.com/food/wine/dishes
 - Wine Recommendation - https://api.spoonacular.com/food/wine/recommendation
 - Wine Pairing - https://api.spoonacular.com/food/wine/pairing

## Generate Meal Plan

Gera um plano alimentar com três refeições por dia (café da manhã, almoço e jantar). Pode-se gerar para um dia apenas ou uma semana inteira. 
Filtra por meta calórica diária e por tipo de dieta.
Na aplicação, pode-se usar o método generateMealPlan() para gerar para um dia e generateMealPlanWeek() para gerar para uma semana, ambos com seus parâmetros:

 - `targetCalories `- um número inteiro (int) que representa a meta de calorias diárias. 
 Ex: 2000
 
 - `diet` - uma String que representa o tipo de dieta. 
 Ex: vegetarian

##  Search Menu Items

Pesquise mais de 115.000 itens de menu de mais de 800 fast food e redes de restaurantes. Por exemplo, Big Mac do McDonald's ou Starbucks Mocha.

Na aplicação, pode-se usar o método searchMenuItems() para efetuar a pesquisa. Seus parâmetros são:

 - `query`- uma String que representa a consulta - o alimento. 
 Ex: burguer
 
 - `number` - um inteiro (int) que representa a quantidade de resultados esperados.
 Ex: 2

## Random Food Joke

Obtenha uma piada aleatória relacionada à comida. Cuidado: este é um endpoint para adultos!

Na aplicação, pode-se usar o método tellJoke() para receber a piada. Seus parâmetros são:

 - `text` - uma String que representa a piada recebida. 
 
Ex de retorno:
`text` = `One Sunday morning George burst into the living room and said, "Dad! Mom! I have some great news for you! I am getting married to the most beautiful girl in town. She lives a block away and her name is Susan. After dinner, George's dad took him aside, "Son, I have to talk with you. Look at your mother, George. She and I have been married 30 years, she's a wonderful wife and mother, but, she has never offered much excitement in the bedroom, so I used to fool around with women a lot." 
"Susan is actually your half sister, and I'm afraid you can't marry her." George was brokenhearted. 
After eight months he eventually started dating girls again. A year later he came home and very proudly announced, "Diane said yes! We're getting married in June." Again his father insisted on another private conversation and broke the sad news. "Diane is your half sister too, George. 
"I'm awfully sorry about this." George was livid! He finally decided to go to his mother with the news his father had shared. 
"Dad has done so much harm. I guess I'm never going to get married," he complained. "Every time I fall in love, Dad tells me the girl is my half sister." 
"Hee hee," his mother chuckled, shaking her head, "Don't pay any attention to what he says. He's not really your father.`

## Random Food Trivia

Retorna curiosidades aleatórias sobre comida.

Na aplicação, pode-se usar o método showTrivia() para receber a piada. Seus parâmetros são:

 - `text` - uma String que representa a curiosidade aleatória recebida.

Ex de retorno: 

`text`=`One of the most popular pizza toppings in Brazil is green peas.`

## Get Random Recipe

Encontre receitas aleatórias (populares). 

Na aplicação, pode-se usar o método getRandomRecipe() para uma receita aleatória. Seus parâmetros são:

 - `number` - um número inteiro (int) que representa a quantidade de
   receitas aleatórias a serem recebidas.

## Wine Description

Obtenha uma descrição simples de um determinado vinho, por exemplo, "malbec", "riesling" ou "merlot".

Na aplicação, pode-se usar o método getWineDescription() para receber a descrição do vinho passado. Seus parâmetros são:

 - `wine` - uma String que recebe o nome do vinho que será descrito.
 
Ex de retorno:  
Considerando a entrada `wine` = `"malbec"`
A saída será: 
`wineDescription`=`"Malbec is a dry red wine which is bold and full bodied."`

## Dish Pairing for Wine

Encontre um prato que combine bem com um determinado vinho.

Na aplicação, pode-se usar o método getDishPairingWine() para receber a descrição do vinho passado. Seus parâmetros são:

 - `wine` - uma String que recebe o nome do vinho a ser harmonizado.
 Ex: 

## Wine Recommendation

Obtenha uma recomendação específica de vinho (produto concreto) para um determinado tipo de vinho, por exemplo, "merlot".

Na aplicação, pode-se usar o método getWineRecommendation() para receber a descrição do vinho passado. Seus parâmetros são:

 - `wine` - uma String que recebe o nome do vinho a ser harmonizado
 
 - `maxPrice` - um número real (double) que representa o preço máximo para recomendação específica de vinho em dólares. 
 
 - `number` - um número inteiro (int) que representa a quantidade de recomendações de vinhos.

## Wine Pairing

Encontre um vinho que combine bem com uma comida. A comida pode ser um nome de prato ("steak"), um nome de ingrediente ("salmon") ou uma culinária ("italian").

Na aplicação, pode-se usar o método getWinePairing() para receber a descrição do vinho passado. Seus parâmetros são:

 - `food` - A comida a ser harmonizada.
 
 - `maxPrice` - um número real (double) que representa o preço máximo para recomendação específica de vinho em dólares.
