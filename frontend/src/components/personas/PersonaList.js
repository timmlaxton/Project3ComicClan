import React from 'react';
import Comic from './Persona.js';
import {Link} from 'react-router-dom';

const PersonaList = (props) => {




  const personas = props.personas.map((persona, index) => {
    const url = "/characters/" + persona.id

    return (
      <li key={index} className="component-item">
        <div className="component">
<Link to={url} >
        <img src={persona.image} Transformation height="300" width="300" crop="fill" effect="sepia" radius="20" />
</Link>
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
