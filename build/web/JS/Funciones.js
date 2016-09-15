
/* ARRAY DE IMAGENES */
ads = new Array(6);
ads[0] = "http://i.imgur.com/ZFB3U86.jpg?1";
ads[1] = "http://i.imgur.com/BoLIVY0.jpg?1";
ads[2] = "http://i.imgur.com/UTt26FY.jpg?1";
ads[3] = "http://i.imgur.com/oQx7agU.jpg?1";
ads[4] = "http://i.imgur.com/sZBkTwg.jpg?1";
ads[5] = "http://i.imgur.com/RUbzLit.jpg?1";


/* ARRAY DE URLs */
arrayURLs = new Array(6);
arrayURLs[0] = "http://i.imgur.com/ZFB3U86.jpg?1";
arrayURLs[1] = "http://i.imgur.com/BoLIVY0.jpg?1";
arrayURLs[2] = "http://i.imgur.com/UTt26FY.jpg?1";
arrayURLs[3] = "http://i.imgur.com/oQx7agU.jpg?1";
arrayURLs[4] = "http://i.imgur.com/sZBkTwg.jpg?1";
arrayURLs[5] = "http://i.imgur.com/RUbzLit.jpg?1";

//variable para llevar la cuenta de la imagen siguiente
var longuitudArray = ads.length;
var contador = 0;
// Cojemos un numero aleatorio
contador = Math.floor((Math.random() * longuitudArray));

var tiempo = 5;// En segundos
var timer = tiempo * 1000;

function banner() {
	contador++;
	contador = contador % longuitudArray;
	document.banner.src = ads[contador];
	setTimeout("banner()", timer);
}

function ponerURL() {
	
       contador2 = contador;
	url = window.open(arrayURLs[contador2]);
	return false;
}
$('.carousel').carousel({
    interval:1000
});


