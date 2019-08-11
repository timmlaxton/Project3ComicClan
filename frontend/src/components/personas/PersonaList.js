import React from 'react';
import Persona from './Persona';

const PersonaList = (props) => {

  const personas = props.personas.map((persona, index) => {
    return (
      <li key={index} className="component-item">
        <div className="component">
          <Persona persona={persona} />
        </div>
      </li>
    )
  })

  return (
    <ul className="component-list">
      {personas}
    </ul>
  )

}

export default PersonaList;
