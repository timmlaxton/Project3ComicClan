import React from 'react';
import Persona from './Persona';
import {Link} from 'react-router-dom';
import ReviewForm from '../reviews/ReviewForm';

const PersonaDetails = (props) => {

  if(!props.persona){
    return "Loading...Character Details"
  }


  return (
    <div className="persona-component">
      <Persona persona={props.persona}/>
      <div className="characterdescription-box">
      <p>{props.persona.description}</p>
      </div>


  </div>

  )


}

export default PersonaDetails;
