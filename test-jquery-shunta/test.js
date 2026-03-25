console.log("山口隼汰");


$(function(){
    $("#show-name").click(function(){
        $("#name").css("color","red");
    });
});

// $(function(){
//     $("alert-age").on("click",function(event){
//         alert("Hello");
//     });
// });



$(function(){
    $("#alert-age").click(function(){
        alert("20");
    });
});


$(function(){
    $("#only-button").click(function(){
        $("#only-button").prop("disabled",true);
    })
})


$(function(){
    $("#language").on("change",function(){
        if(value === "b"){
            $("b").html(`
                System.out.println("Hello World");`);
             ) else if(value === c){
                    $("c").html(
                        `console.log("Hello World");`
                    )
                }
        }
    })
})














































// $(function () {
//     $("#show-name").click(function () {
//         $("#name").text("山田太郎");
//     });
// });


// $(function(){
//     $("#name").css("color","blue");
//     $("#show-name").on("click",function(){
//         const currentColor = $("#name").css("color")
//         if(currentColor === "rgb(0, 0, 255)"){
//             $("#name").css("color","red");
//         }else{
//             $("#name").css("color","blue");
//         }
//     })    
// })
