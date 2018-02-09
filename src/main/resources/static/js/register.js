$(document).ready(function(){
	
	var email = $('#email');
    var name = $('#name');
    var surname = $('#surname');
    var pass1 = $('#pass1');
    var pass2 = $('#pass2');
    
    name.on('blur', function (){
        var _tempName = name.val().match('^[a-zA-Z]{3,16}$');
        console.log('temp name:  ', _tempName);
        console.log(name.val());
        console.log('tymczasowy name: ' + _tempName);
        console.log('aktualne pole input name: ' + name.val());
        if (_tempName == name.val()){
            //kiedy dodaję przez addClass to bootstrap nadpisuje moją klasę
            name.css('box-shadow' ,'0 0 1px 1px green inset');
            
        } else {
            name.css('box-shadow' ,'0 0 1px 1px red inset');  
        }
    });
    
    
    
    
    function isEmail(email) {
        var regex = /^([a-zA-Z0-9_.+-])+\@(([a-zA-Z0-9-])+\.)+([a-zA-Z0-9]{2,4})+$/;
        return regex.test(email);
    }    
    email.on('blur', function(){
        if (isEmail(email.val())){
            email.css('box-shadow' ,'0 0 1px 1px green inset');
            console.log('poprawne')
        } else {
            email.css('box-shadow' ,'0 0 1px 1px red inset');  
        }
    }); 
	
	console.log("dupa123")
	
});