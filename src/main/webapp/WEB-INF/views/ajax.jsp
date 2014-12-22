<html>
<head>
<TITLE>Crunchify - Spring MVC Example with AJAX call</TITLE>
 
<style type="text/css">
body {
    background-image:
        url('http://cdn3.crunchify.com/wp-content/uploads/2013/03/Crunchify.bg_.300.png');
}
</style>

<script  src="https://ajax.googleapis.com/ajax/libs/jquery/1.4.4/jquery.min.js"></script>

<script type="text/javascript">

$(document).ready(function() {
    var max_fields      = 10; //maximum input boxes allowed
    var wrapper         = $(".input_fields_wrap"); //Fields wrapper
    var add_button      = $(".add_field_button"); //Add button ID
    
    var x = 1; //initlal text box count
    $(add_button).click(function(e){ //on add input button click
        
    	e.preventDefault();
        if(x < max_fields){ //max input box allowed
            x++; //text box increment
            $(wrapper).append('<div><input class="test" type="text" id = "' +x+'"  name="mytext[]"/><a href="#" class="remove_field">Remove</a></div>'); //add input box
        }
    });
    
    $(wrapper).on("click",".remove_field", function(e){ //user click on remove text
        e.preventDefault(); 
        $(this).parent('div').remove(); x--;
    })
});

function crunchifyAjax() {
	
	var param1 = $("#nom").val();
	var param2 = $("#prenom").val();
	
	
	var param3 =[];
	for ( var i = 0; i < $(".test").size(); i++ ) {


	    param3[i]=$(".test").eq(i).val();
	}
	
    $.ajax({
        url : 'ajaxtest.html',
        data: "param1="+param1+"param2="+param2+"param3="+param3,
        
        success : function(data) {
        	
        	alert("nom :" + param1 + "/  prenom   :" + param2+ "/  dynamyque fields   :" + param3 );
            $('#result').html(data);
        }
    });
}
</script>


<script type="text/javascript"
    src="http://code.jquery.com/jquery-1.10.1.min.js"></script>

 

</head>
 
<body>
Nom<input  name="nom" id="nom" type="text">
prenom<input  name="prenom" id="prenom" type="text">


<input type="submit" value="Add Test" onclick="crunchifyAjax()">
			<div class="input_fields_wrap">
				    <button class="add_field_button">Add More Fields</button>
			</div>

    <div align="center">
        <br> <br> ${message} <br> <br>
        <div id="result"></div>
        <br>
        <p>
                    </p>
    </div>
</body>
</html>