import React from 'react';
import './App.css';

function App() {
  const element = "Office Space";
  const ItemName = { Name: "DBS", Rent: 50000, Address: "Chennai" };

  const sr = "https://tse3.mm.bing.net/th/id/OIP.1r1-AwHkRMqBY0-G3fvEngHaE8?rs=1&pid=ImgDetMain&o=7&rm=3";
  const jsxatt = <img src={sr} width="25%" height="25%" alt="Office Space" />;

  let colors = [];
  if (ItemName.Rent <= 60000) {
    colors.push('textRed');
  } else {
    colors.push('textGreen');
  }

  return (
    <div className="App">
      <h1>{element}, at Affordable Range</h1>
      {jsxatt}
      <h1>Name: {ItemName.Name}</h1>
      <h3 className={colors[0]}>Rent Rs. {ItemName.Rent}</h3>
      <h3>Address: {ItemName.Address}</h3>
    </div>
  );
}

export default App;