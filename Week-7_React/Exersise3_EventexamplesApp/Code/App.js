import React from 'react';
import './App.css';
import EventExamples from './EventExamples';
import CurrencyConvertor from './CurrencyConvertor';

function App() {
  return (
    <div className="App">
      <EventExamples />
      <h2 className="converter-title">Currency Convertor!!!</h2>
      <CurrencyConvertor />
    </div>
  );
}

export default App;