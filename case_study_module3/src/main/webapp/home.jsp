<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
    <style>

    </style>
</head>
<body style="background-image: url(https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/754c5436-8761-437a-b826-c36e8cc6edd6/d2hbd59-e80fb128-99be-4ae4-86b2-c5e663478dd3.png/v1/fill/w_1131,h_707,q_70,strp/chrome_windows_logo_3002r_uplo_by_ktb2424_d2hbd59-pre.jpg?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7ImhlaWdodCI6Ijw9MTg3NSIsInBhdGgiOiJcL2ZcLzc1NGM1NDM2LTg3NjEtNDM3YS1iODI2LWMzNmU4Y2M2ZWRkNlwvZDJoYmQ1OS1lODBmYjEyOC05OWJlLTRhZTQtODZiMi1jNWU2NjM0NzhkZDMucG5nIiwid2lkdGgiOiI8PTMwMDAifV1dLCJhdWQiOlsidXJuOnNlcnZpY2U6aW1hZ2Uub3BlcmF0aW9ucyJdfQ.e5ZEhcGRQl3OyKNpZ2OdWxoqtXyg6X1surfYuh_2kf0)">
<form>
    <div class="container-fluid ">
        <div class="border border-3 row">
            <div class="col-lg-6">
                <img style="width: 100px" height="70px"
                     src="https://tienaoplus.com/wp-content/uploads/2020/02/y-nghia-logo-apple-2.jpg">
            </div>
            <div class="col-lg-6 mt-lg-3 pe-lg-5">
                <a href="#" class="nav-link float-lg-end">Lê Văn Tiến</a>
            </div>
        </div>
        <div class="border border-3 row" style="background-image: url(https://media.istockphoto.com/photos/monochrome-texture-with-white-and-gray-color-picture-id1138782666?k=20&m=1138782666&s=612x612&w=0&h=w6pvW-YGmHYUf_VLY7SRZUX7mnwILJI9NZWNVcu5lhQ=);">
            <div class="col-lg-9 row float-lg-end">
                <p class="col-lg-2"></p>
                <a class="nav-link col-lg-2" href="#">Home</a>
                <a class="nav-link col-lg-2" href="/employee">Employee</a>
                <a class="nav-link col-lg-2" href="/customer?actionUser=showList">Customer</a>
                <a class="nav-link col-lg-2" href="/service">Service</a>
                <a class="nav-link col-lg-2" href="#">Contact</a>
            </div>
            <div class="col-lg-3 pt-lg-1">
                <svg xmlns="http://www.w3.org/2000/svg" width="16" height="16" fill="currentColor" class="bi bi-search"
                     viewBox="0 0 16 16">
                    <path d="M11.742 10.344a6.5 6.5 0 1 0-1.397 1.398h-.001c.03.04.062.078.098.115l3.85 3.85a1 1 0 0 0 1.415-1.414l-3.85-3.85a1.007 1.007 0 0 0-.115-.1zM12 6.5a5.5 5.5 0 1 1-11 0 5.5 5.5 0 0 1 11 0z"/>
                </svg>
                <input class="rounded-pill w-75" type="text" placeholder=" search">
            </div>
        </div>
        <div class="border border-3 row h-75">
            <div class="col-lg-3 border border-3">
                <iframe width="310" height="200" src="https://www.youtube.com/embed/pF-3S-HTJSg" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
                <iframe width="310" height="200" src="https://www.youtube.com/embed/GPQhIrp1AJ4" title="YouTube video player" frameborder="0" allow="accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture" allowfullscreen></iframe>
            </div>
            <div class="col-lg-9 text-center">

            </div>
        </div>
        <div class="border border-3 row text-center" style="background-image: url(https://images-wixmp-ed30a86b8c4ca887773594c2.wixmp.com/f/754c5436-8761-437a-b826-c36e8cc6edd6/d4xmmg4-883c5c3d-2e64-445f-8dc4-a7c4eef8f41c.png?token=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJzdWIiOiJ1cm46YXBwOjdlMGQxODg5ODIyNjQzNzNhNWYwZDQxNWVhMGQyNmUwIiwiaXNzIjoidXJuOmFwcDo3ZTBkMTg4OTgyMjY0MzczYTVmMGQ0MTVlYTBkMjZlMCIsIm9iaiI6W1t7InBhdGgiOiJcL2ZcLzc1NGM1NDM2LTg3NjEtNDM3YS1iODI2LWMzNmU4Y2M2ZWRkNlwvZDR4bW1nNC04ODNjNWMzZC0yZTY0LTQ0NWYtOGRjNC1hN2M0ZWVmOGY0MWMucG5nIn1dXSwiYXVkIjpbInVybjpzZXJ2aWNlOmZpbGUuZG93bmxvYWQiXX0.-CeLiQyL44pQWZJOfGmwAT3eMk7QU-HgvTSeKI5JXP8);">
            <p>Footer</p>
        </div>
    </div>
</form>
<script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
</body>
</html>