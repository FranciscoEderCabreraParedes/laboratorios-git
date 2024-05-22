Implementing and Optimizing database querys

  Provided SQL Queries for Optimization:
  
  1- Orders Query: Retrieve orders with many items and calculate the total price
  
        SELECT Orders.OrderID, SUM(OrderDetails.Quantity * OrderDetails.UnitPrice) AS TotalPrice
        FROM Orders
        JOIN OrderDetails ON Orders.OrderID = OrderDetails.OrderID
        WHERE OrderDetails.Quantity > 10
        GROUP BY Orders.OrderID;

        Podriamos ver varios escenarios de optimización: 
          - Agregar indices a Orders.OrderId y OrderDetails.OrderID
          - Modificaria un poco la estructura de la tabla para al momento de guardar la información tener el totalPrice ya calculado y reducir operaciones en el query
          - Opcionalmente particionar la tabla OrderDetails en OrderDetails_menudeo (ordenes con cantidad menor o igual a 10 unidades) y OrderDetails_mayoreo (ordenes con   
             cantidad mayor a 10 unidades)

        SELECT Orders.OrderID, SUM(OrderDetails.TotalPrice) AS Total
        FROM Orders
        JOIN OrderDetails_mayoreo ON Orders.OrderID = OrderDetails.OrderID
        GROUP BY Orders.OrderID;
    
  
  2- Customer Query: Find all customers from London and sort by CustomerName. 
       
       SELECT CustomerName FROM Customers WHERE City = 'London' ORDER BY CustomerName;

       Para la optimizacón de este query pienso que sería suficiente con agregar los siguientes indices:
         - CREATE INDEX idx_customer_name ON Customers CustomerName;
         - CREATE INDEX idx_city ON Customers City;

         
  NoSQL Queries for Review:
  
  1- User Posts Query: Retrieve the most popular active posts and display their title and like count.

    db.posts
    .find({ status: "active" }, { title: 1, likes: 1 })
    .sort({ likes: -1 });

    Para ejemplo anterior pienso bastaria con agregar los sigueintes indices
    db.posts.createIndex({ "active" : 1 , likes: -1 });

  2- User Data Aggregation: Summarize the number of active users by location

    db.users.aggregate([
      { $match: { status: "active" } },
      { $group: { _id: "$location", totalUsers: { $sum: 1 } } },
    ]);

     Para optimizar el ejemplo anterior se agregarian los sigueintes indices:
       db.users({ "status" : 1 , location: 1 });
     
    
