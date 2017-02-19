function showNewMovieForm() {
  $.get("/newmovie", function (data) {
      $("#main_container").load(data);
      $("#newmovie_li").addClass("active");
  })
}
function showModifyMovieForm() {
    $.get("/modifymovie", function (data) {
        $("#main_container").load(data);
        $("#modifymovie_li").addClass("active");
    })
}