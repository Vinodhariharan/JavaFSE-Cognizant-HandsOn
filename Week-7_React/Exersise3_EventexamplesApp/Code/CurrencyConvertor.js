import React, { useState } from 'react';

function CurrencyConvertor() {
  const [rupees, setRupees] = useState(0);
  const [euros, setEuros] = useState(0);
  const INR_TO_EURO_RATE = 0.011;

  const handleSubmit = () => {
    const convertedAmount = (rupees * INR_TO_EURO_RATE).toFixed(2);
    setEuros(convertedAmount);
    
    alert(`${rupees} INR is equal to €${convertedAmount} EUR.`);
  };
  
  const handleInputChange = (event) => {
    setRupees(event.target.value);
  };

  return (
    <div className="card">
      <div className="input-group">
        <label>Indian Rupees (INR): </label>
        <input 
          type="number" 
          value={rupees} 
          onChange={handleInputChange} 
          placeholder="Enter amount in INR"
        />
      </div>
      <button onClick={handleSubmit}>Convert</button>
      <h3>Equivalent in Euros (EUR): €{euros}</h3>
    </div>
  );
}

export default CurrencyConvertor;