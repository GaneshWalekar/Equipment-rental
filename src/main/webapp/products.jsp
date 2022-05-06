<div class="form-group mt-4">
  <div class="owl-carousel owl-parent align-items-center">


    <c:forEach var="product" items="${products}">
        <div class="card border-0 product">
                <img class="card-img-top" src="${product.getProd_url()}" alt="Card image">
                <div class="card-body">
                  <h4 class="card-title">${product.getProd_name()}</h4>
                  <p class="card-text">${product.getProd_value()}</p>
                  <a href="#" class="btn btn-primary">Add to cart</a>
                </div>
          </div>
    </c:forEach>
  </div>
</div>
