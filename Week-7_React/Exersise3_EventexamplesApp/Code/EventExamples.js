import React, { useState } from 'react';

function EventExamples() {
  // State for the counter
  const [count, setCount] = useState(0);

  // Handler for Increment button
  const handleIncrementClick = () => {
    setCount(prevCount => prevCount + 1);
  };

  // Handler for Decrement button
  const handleDecrementClick = () => {
    setCount(prevCount => prevCount - 1);
  };

  // Handler for Welcome button (shows an alert)
  const sayMessage = (message) => {
    alert(message);
  };

  // Handler for Synthetic Event button
  const handleSyntheticEventClick = (event) => {
    alert(`Hello User!!!`);
  };

  return (
    <div className="event-container">
        <h1><strong>{count}</strong></h1>
      <div className="button-column" style={{flex:"row"}}>
        <button onClick={handleIncrementClick}>Increment</button>
        <button onClick={handleDecrementClick}>Decrement</button>
        <button onClick={() => sayMessage('Welcome')}>Say Welcome</button>
        <button onClick={handleSyntheticEventClick}>Click Me</button>
      </div>
      <div >
      </div>
    </div>
  );
}

export default EventExamples;