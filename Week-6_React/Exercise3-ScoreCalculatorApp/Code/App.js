import { CalculateScore } from './Components/CalculateScore';

function App() {
  return (
    <div>
      <CalculateScore 
        Name={"Steeve"} 
        School={"DNV Public School"} 
        total={250} 
        goal={3} 
      />
    </div>
  );
}

export default App;
