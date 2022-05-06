<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="UTF-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css"
    rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.8.1/font/bootstrap-icons.css">  
  <style>
    .divider:after,
.divider:before {
content: "";
flex: 1;
height: 1px;
background: #eee;
}
  </style>
  </head>
<body>
<div >
<%@ include file="nav.jsp" %>
</div>
<div class="container-fluid mt-4">
  <section class="vh-100">
    <div class="container py-5 h-100">
      <div class="row d-flex align-items-center justify-content-center h-100">
        <div class="col-md-8 col-lg-7 col-xl-6">
          <img src="https://mdbcdn.b-cdn.net/img/Photos/new-templates/bootstrap-login-form/draw2.svg"
            class="img-fluid" alt="Phone image">
        </div>
        <div class="col-md-7 col-lg-5 col-xl-5 offset-xl-1">
          <form action="login" method="post">
            <!-- Email input -->
            <div class="form-outline mb-4">
              <label class="form-label" for="userName">User Name</label>
              <input type="text" id="userName" class="form-control form-control-lg" name="uname"/>
              
            </div>
  
            <!-- Password input -->
            <div class="form-outline mb-4">
              <label class="form-label" for="passwd">Password</label>
              <input type="password" id="passwd" class="form-control form-control-lg" name="pwd" />
              
            </div>
  
            <!-- Submit button -->
            <button type="submit" class="btn btn-primary btn-lg btn-block">Sign in</button>
  
            <div class="divider d-flex align-items-center my-4">
              <p class="text-center fw-bold mx-3 mb-0 text-muted">OR</p>
            </div>
            
            <div class="d-grid">
              <a class="btn btn-primary btn-lg btn-block" style="background-color: #3b5998" href="#!"
              role="button">
              <i class="bi bi-facebook me-2"></i>Continue with Facebook
            </a>
            <a class="btn btn-primary btn-lg  mt-2" style="background-color: #55acee" href="#!"
              role="button">
              <i class="bi bi-twitter me-2"></i>Continue with Twitter</a>
            </div>
            
  
          </form>
        </div>
      </div>
    </div>
  </section>
</div>  


<%@ include file="footer.jsp" %>

<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
</body>

</html>
